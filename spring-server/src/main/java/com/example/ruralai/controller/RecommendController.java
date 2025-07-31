package com.example.ruralai.controller;

import com.example.ruralai.dto.InputDto;
import com.example.ruralai.dto.RecommendResultDto;
import com.example.ruralai.service.AiRecommendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class RecommendController {

    private final AiRecommendService aiRecommendService;

    @PostMapping("/api/recommend")
    public Mono<RecommendResultDto> recommend(@RequestBody InputDto inputDto) {
        return aiRecommendService.getRecommendation(inputDto);
    }
}
