package com.obamax.ppmtool.controllers;


import com.obamax.ppmtool.repositories.ProjectRepository;
import com.obamax.ppmtool.web.ProjectController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class ProjectControllerTest {

    @MockBean
    private ProjectRepository projectRepository;

    @Autowired
    ProjectController projectController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void givenSaveOrUpdateProject_whenCorrectInput_thenSuccess() throws Exception {
//        mockMvc.perform(post("/api/project"))
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isCreated());
    }

}
