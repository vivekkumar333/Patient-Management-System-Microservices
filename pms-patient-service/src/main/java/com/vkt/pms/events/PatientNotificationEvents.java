package com.vkt.pms.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientNotificationEvents {
    private Long patientId;
    private String name;
    private String email;
    private String eventType;

}
