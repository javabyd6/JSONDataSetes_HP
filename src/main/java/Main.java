import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author perczynski
 */
public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Data pokemons = mapper.readValue(new File("pokedex.json"),Data.class);
            System.out.println(pokemons);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
