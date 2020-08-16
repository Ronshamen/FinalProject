package SanityTests;

import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.ApiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class ApiTest extends CommonOps
{
    @Test(description = "Test01: Get team from Grafana")
    @Description("Description: log in and get Team information")
    public void test01_getTeam()

    {
        Verifications.textOnPage(ApiFlows.getTeamProperty("teams[0].name"), getData("api_Team1"));
    }

    @Test(description = "Test02: Add team")
    @Description("Description: Add team to Grafana and verify")
    public void test02_addTeam()
    {
        ApiFlows.postTeam(getData("api_Team2Name"), getData("api_Team2Email"));
        Verifications.textOnPage(ApiFlows.getTeamProperty("teams[0].name"), getData("api_Team2Name"));
    }

    @Test(description = "Test03: UpDate team")
    @Description("Description: UpDate team to Grafana and verify")
    public void test03_updateTeam()
    {
        ApiFlows.upDateTeam(getData("api_Team2Name"), getData("api_Team2EmailNew"), ApiFlows.getTeamProperty("teams[0].id"));
        Verifications.textOnPage(ApiFlows.getTeamProperty("teams[0].email"), getData("api_Team2EmailNew"));
    }

    @Test(description = "Test04: Delete team")
    @Description("Description: Delete team on Grafana and verify")
    public void test04_DeleteTeam()
    {
        ApiFlows.DeleteTeam(ApiFlows.getTeamProperty("teams[0].id"));
        Verifications.textOnPage(ApiFlows.getTeamProperty("totalCount"), "1");
    }
}
