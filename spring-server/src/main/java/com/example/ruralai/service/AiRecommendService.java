package com.example.ruralai.service;


import com.example.ruralai.dto.InputDto;
import com.example.ruralai.dto.RecommendResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AiRecommendService {

    private final WebClient webClient;

    public Mono<RecommendResultDto> getRecommendation(InputDto inputDto) {
        return webClient.post()
            .uri("/recommend")
            .bodyValue(inputDto)
            .retrieve()
            .bodyToMono(RecommendResultDto.class);
    }
}
