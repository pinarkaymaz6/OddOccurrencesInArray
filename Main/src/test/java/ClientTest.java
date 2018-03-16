import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void solution() {
        int[] A1 = {9,3,9,3,9,7,9};

        Client client = new Client();
        assertEquals(7,client.solution(A1));
    }

}