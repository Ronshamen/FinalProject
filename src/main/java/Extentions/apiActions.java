package Extentions;

import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class apiActions extends CommonOps
{
    @Step("Get data from server")
    public static Response Get(String paramValues)
    {
        response = httpRequest.get(paramValues);
        System.out.println(response.prettyPrint());
        return response;
    }
    @Step("Extract data from Json file")
    public static String extractFromJson(Response response, String path)
    {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("post data to sever")
    public static void post(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        System.out.println(response.prettyPrint());
    }

    @Step("update data to sever")
    public static void put(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        System.out.println(response.prettyPrint());
    }

    @Step("delete data from sever")
    public static void delete(String id)
    {
        response = httpRequest.delete(getData("Path_others") + id);
        System.out.println(response.prettyPrint());
    }
}
