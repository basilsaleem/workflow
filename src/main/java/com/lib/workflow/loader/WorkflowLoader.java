package com.lib.workflow.loader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.lib.workflow.WorkflowDefinition;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class WorkflowLoader {

    public WorkflowDefinition loadWorkflow(String name) throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        InputStream input = getClass().getResourceAsStream("/workflows/" + name + ".yaml");
        return mapper.readValue(input, WorkflowDefinition.class);
    }
}