package com.timelogr.enterprise.dao;

import com.timelogr.enterprise.dto.Account;
import com.timelogr.enterprise.dto.Project;
import com.timelogr.enterprise.dto.TimeLog;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Map;

@Repository
public class TimeLogrDAOstub implements TimeLogrDAO {

    HashMap<Integer, TimeLog> allTimeLogs = new HashMap<>();
    @Override
    public TimeLog saveLog(TimeLog timeLog) {
        Integer timeLogID = timeLog.getId();
        allTimeLogs.put(timeLogID, timeLog);
        return timeLog;
    }

    @Override
    public List<TimeLog> getAllLoggedTime() {
        List<TimeLog> allLogs = new ArrayList<>(allTimeLogs.values());
        return allLogs;
    }

    @Override
    public Project saveProject(Project project) {
        return null;
    }

    @Override
    public List<Project> getAllProjects() {
        return null;
    }

    HashMap<Integer, Account> allAccounts = new HashMap<>();
    @Override
    public Account saveAccount(Account account) {
        int accountID = account.getId();
        allAccounts.put(accountID, account);
        return account;
    }

    @Override
    public List<Account> getAllAccounts() {
        List<Account> allAcc = new ArrayList<>(allAccounts.values());
        //String[] allAcc = allAccounts.values().toArray();
        return allAcc;
    }

    @Override
    public Account findAccountByEmail(String email) {
        List<Account> allAcc = new ArrayList<>(allAccounts.values());
        for(Account temp : allAcc){
            if(temp.getEmail().equals(email)){
                return temp;
            }
        }
        return null;
    }

    @Override
    public Account findAccountById(Integer id) {
        List<Account> allAcc = new ArrayList<>(allAccounts.values());
        for(Account temp : allAcc){
            if(temp.getId() == id){
                return temp;
            }
        }
        return null;
    }

    @Override
    public Project findProjectById(Integer id) {
        List<Project> allProjects = new ArrayList<>(getAllProjects());
        for(Project temp: allProjects){
            if(temp.getId() == id){
                return temp;
            }
        }
        return null;
    }

    @Override
    public List<Project> getClientProjects(int client) {
        return null;
    }

    @Override
    public List<TimeLog> getProjectLogs(int projectId) {
        return null;
    }

    @Override
    public Project getProjectById(int projectId) {
        return null;
    }

}
