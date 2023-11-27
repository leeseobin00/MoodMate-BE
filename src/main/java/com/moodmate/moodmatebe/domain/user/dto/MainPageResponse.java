package com.moodmate.moodmatebe.domain.user.dto;

import com.moodmate.moodmatebe.domain.user.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MainPageResponse {
    private Long userId;
    private Gender userGender;
    private Boolean userMatchActive;

    private Long roomId;
    private Boolean roomActive;
}
