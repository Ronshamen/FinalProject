package WorkFlows;

import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import Extentions.apiActions;

public class ApiFlows extends CommonOps
{
    @Step("Get team from grafana")
    public static String getTeamProperty(String jpath)
    {
        Response response = apiActions.Get(getData("Path_get"));
        return apiActions.extractFromJson(response, jpath);
    }

    @Step("Create new team on grafana")
    public static void postTeam(String name, String email)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.post(requestParams, getData("Path_post"));
    }

    @Step("UpDate team on grafana")
    public static void upDateTeam(String name, String email, String id)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.put(requestParams, getData("Path_others") + id);
    }

    @Step("Delete team from grafana")
    public static void DeleteTeam(String id)
    {
        apiActions.delete(id);
    }
}
