package com.huawei.genex.common.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CommonTask {
    @Id
    @GeneratedValue
    protected Long id;
    protected String commitBy;
    protected String description;
}
