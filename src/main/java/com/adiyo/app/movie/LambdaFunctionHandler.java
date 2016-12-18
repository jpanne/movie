package com.adiyo.app.movie;

import com.adiyo.app.movie.model.LambdaRequest;
import com.adiyo.app.movie.model.Movie;
import com.adiyo.app.movie.service.MovieService;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

/**
 * Created by kishorechava on 12/15/16.
 */
public class LambdaFunctionHandler implements RequestHandler<LambdaRequest, String> {

    static final Logger log = Logger.getLogger(LambdaFunctionHandler.class);

    public String handleRequest(LambdaRequest request, Context context)
            throws RuntimeException {

        SpringBootInvocation bootInvocation = new SpringBootInvocation();
        bootInvocation.run();

        MovieService service = bootInvocation.getApplicationContext().getBean(MovieService.class);

        return convertObjectToJsonString(service.getMovies());
    }

    private String convertObjectToJsonString(List<Movie> movies) {
        String jsonResponse = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonResponse = mapper.writeValueAsString(movies);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }

    public static void main(String[] args) {
        SpringBootInvocation bootInvocation = new SpringBootInvocation();
        bootInvocation.run();
    }

}
