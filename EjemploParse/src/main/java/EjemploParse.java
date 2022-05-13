import org.json.JSONArray;
import org.json.JSONObject;

public class EjemploParse {
    public static void main(String args[]) {
        String cadenaJson = "{\n" +
                "\"pageInfo\": {\n" +
                "\"pageName\": \"Homepage\",\n" +
                "\"logo\": \"https://www.example.com/logo.jpg\"\n" +
                "},\n" +
                "\"posts\": [\n" +
                "{\n" +
                "\"post_id\": \"0123457895\",\n" +
                "\"actor_id\": \"1045\",\n" +
                "\"author_name\": \"Jane Doe\",\n" +
                "\"post_title\": \"How to parse JSON in Java\",\n" +
                "\"comments\": [{\"comment\":\"Muy Bie\"},{\"comment\":\"Bueno, mas o menos\"}],\n" +
                "\"time_of_post\": \"1234575362\"\n" +
                "},\n" +
                " {\n" +
                "\"post_id\": \"9876547531\",\n" +
                "\"actor_id\": \"1489\",\n" +
                "\"author_name\": \"Jane Doe\",\n" +
                "\"post_title\": \"How to parse JSON in Java\",\n" +
                "\"comments\": [{\"comment\":\"BUENA CRACK\"},{\"comment\":\"Eres super bueno\"}],\n" +
                "\"time_of_post\": \"9876515984\"\n" +
                "}\n" +
                "]\n" +
                "}";

        JSONObject obj = new JSONObject(cadenaJson);

        String vivo = obj.getJSONObject("pageInfo").getString("pageName");

        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);
            JSONArray comment = arr.getJSONObject(i).getJSONArray("comments");
            for (int j = 0; j < comment.length(); j++) {
                String com = comment.getJSONObject(j).getString("comment");
                System.out.println(com);
            }
        }

        System.out.println(vivo);
    }
}

