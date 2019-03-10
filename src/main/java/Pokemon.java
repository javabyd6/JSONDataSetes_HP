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
public class Pokemon {

    private String id;
    private String num;
    private String name;
    private String img;
    private List<String> type;
    private String height;
    private String weight;
    private String candy;
    private Integer candy_count;
    private String egg;
    private Integer spawn_chance;
    private Integer avg_spawns;
    private String  spawn_time;
    private List<Double> multipliers;
    private List<String> weaknesses;
    private List<NextEvolution> next_evolution;
    private List<PrevEvolution> prev_evolution;


}
