package com.huawei.genex.trafficforecast.repository;

import com.huawei.genex.common.repository.CommonTaskRepository;
import com.huawei.genex.trafficforecast.domain.UmtsTask;
import org.springframework.stereotype.Repository;

@Repository
public interface UmtsTaskRepository extends CommonTaskRepository<UmtsTask,Long> {
}
