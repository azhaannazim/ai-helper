package com.ai.springAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GenAIController {

    @Autowired
    ChatService geminiService;

    @GetMapping("/prompt")
    public String getResponse(String prompt, String geminiKey) {
        return geminiService.callApi(prompt,geminiKey);

    }
}
