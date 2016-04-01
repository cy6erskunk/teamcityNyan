package teamcityNyanify;

import jetbrains.buildServer.serverSide.TeamCityProperties;
import jetbrains.buildServer.web.openapi.PagePlaces;
import jetbrains.buildServer.web.openapi.PlaceId;
import jetbrains.buildServer.web.openapi.SimplePageExtension;
import org.jetbrains.annotations.NotNull;

public class NyanNyan extends SimplePageExtension {
    public NyanNyan(@NotNull PagePlaces pagePlaces) {
        super(pagePlaces, PlaceId.ALL_PAGES_HEADER, "teamcityNyanify", "nyanify.jsp");
        if (TeamCityProperties.getBooleanOrTrue("teamcity.ui.nyanify")) {
            addCssFile("nyan-nyan.css");
        }
        register();
    }
}