package com.huawei.genex.trafficforecast.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.huawei.genex.common.domain.CommonTask;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class LteTask extends CommonTask {
    @JsonIgnore
    private String lParam;
}
