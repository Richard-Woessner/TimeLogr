package com.timelogr.enterprise.service;

import com.timelogr.enterprise.dto.Account;
import com.timelogr.enterprise.dto.Project;
import com.timelogr.enterprise.dto.TimeLog;

import java.math.BigDecimal;
import java.util.List;

public interface TimeLogrService {

    TimeLog saveLog(TimeLog timeLog);

    List<TimeLog> getAllLoggedTime();

    Project saveProject(Project project);

    List<Project> getAllProjects();

    Account saveAccount(Account account);

    List<Account> getAllAccounts();

    Account findAccountByEmail(String email);

    Account findAccountById(Integer id);

    Project findProjectById(Integer id);

    List<Project> getClientProjects (int client);

    BigDecimal sumProjectLogsTime (Project project);

    BigDecimal sumProjectLogsCost (Project project);

    Project getProjectById(int projectId);
}