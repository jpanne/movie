package com.adiyo.app.movie;

/**
 * Created by kishorechava on 12/15/16.
 */
public class LambdaFunctionHandler /*implements RequestHandler<LambdaRequest, String>*/ {

    /*static final Logger log = Logger.getLogger(LambdaFunctionHandler.class);

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
    }*/

    /*public static void main(String[] args) {
        SpringBootInvocation bootInvocation = new SpringBootInvocation();
        bootInvocation.run();
    }*/

}
