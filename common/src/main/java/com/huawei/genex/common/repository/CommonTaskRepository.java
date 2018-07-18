package com.huawei.genex.common.repository;

import com.huawei.genex.common.domain.CommonTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonTaskRepository<T extends CommonTask,ID> extends JpaRepository<T,ID> {

}

