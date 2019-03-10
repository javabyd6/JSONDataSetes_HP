import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author perczynski
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrevEvolution {
    private List<Evolution> prevEvolutions;
    private String num;
    private String name;


}
