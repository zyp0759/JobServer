package cn.pingweb.dao;

import cn.pingweb.model.JobSkill;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSkillDao{
	List<JobSkill> getJobSkill(Long job_id);
}
