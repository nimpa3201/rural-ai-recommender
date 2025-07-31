package com.example.ruralai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RecommendResultDto {

    @JsonProperty("recommended_region")
    private String recommendedRegion;

    @JsonProperty("matched_policies")
    private List<String> matchedPolicies;
}