package com.victor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TechnicalTestApplicationTests {

@Test
void testTrue() {
  assertThat(true).isTrue();
}

}
