package com.huawei.genex.trafficforecast.repository;

import com.huawei.genex.common.repository.CommonTaskRepository;
import com.huawei.genex.trafficforecast.domain.LteTask;
import org.springframework.stereotype.Repository;

@Repository
public interface LteTaskRepository extends CommonTaskRepository<LteTask,Long> {
}
