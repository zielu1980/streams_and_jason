package jason.Zad2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString (of = {"id", "title"})
public class MenuResult {
    private int id;
    private String title;
    private String restaurantChain;
    private String servingSize;
    private String readableServingSize;
    private String image;
    private String imageType;
}
