package de.dkwr.testcontainersdemo.test;

import de.dkwr.testcontainersdemo.Vet;
import de.dkwr.testcontainersdemo.VetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@Import(ContainerConfig.class)
public class VetTest {
    @Autowired
    VetRepository vetRepository;

    @Test
    void testFindAll() {
        vetRepository.save(new Vet(1, "Dr. Jean-Paul", "Sartre"));

        assertEquals(1, vetRepository.count());
    }
}
