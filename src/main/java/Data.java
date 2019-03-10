import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author perczynski
 */
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {

    private  List<Pokemon> pokemon = new ArrayList<>();

}
