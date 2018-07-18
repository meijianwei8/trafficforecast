package com.huawei.genex.common.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CommonTask {
    @Id
    @GeneratedValue
    @Pattern(regexp = "^[0-9]{10}$")
    @NotNull
    protected Long id;
    protected String commitBy;
    protected String description;
}
