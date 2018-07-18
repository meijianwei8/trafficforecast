package com.huawei.genex.trafficforecast.domain;

import com.huawei.genex.common.domain.CommonTask;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
public class UmtsTask extends CommonTask {
    private String uParam;
    private String uParam2;
}
