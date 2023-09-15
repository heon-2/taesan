package com.taesan.habit.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HabitCalendarSpecificResponse {

    @JsonProperty("dayList")
    List<DayInfo> dayList;

}