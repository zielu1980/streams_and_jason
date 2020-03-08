package jason.Zad1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class RecipesResponse {

    private List<RecipeResult> results;
    private String baseUri;
    private int offset;
    private  int number;
    private int totalResults;
    private  int processingTimeMs;
    private Long expires;

    @JsonProperty("isStale")
    private  boolean stale;

}
