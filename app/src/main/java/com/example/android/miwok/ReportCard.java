package com.example.android.miwok;

import java.util.ArrayList;
import java.util.HashMap;

public class ReportCard {

    private ArrayList<HashMap<String, Integer>> grades;

    public ReportCard() {
        grades = new ArrayList<>();
    }

    public ReportCard(ArrayList<HashMap<String, Integer>> grades) {
        this.grades = grades;
    }

    public ArrayList<HashMap<String, Integer>> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<HashMap<String, Integer>> grades) {
        this.grades = grades;
    }

    public boolean addGrade(HashMap<String, Integer> grade) {
        for (HashMap<String, Integer> g : grades) {
            for (String key : grade.keySet()) {
                if (g.containsKey(key))
                    return false;
            }
        }
        grades.add(grade);
        return true;
    }

    public boolean removeGrade(String subjectName) {
        for (HashMap<String, Integer> g : grades) {
            if (g.containsKey(subjectName)) {
                grades.remove(g);
                return true;
            }
        }
        return false;
    }

    public boolean updateGrade(HashMap<String, Integer> grade) {
        for (HashMap<String, Integer> g : grades) {
            for (String subjectName : grade.keySet()) {
                if (g.containsKey(subjectName)) {
                    grades.remove(g);
                    grades.add(grade);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "grades=" + grades +
                '}';
    }

}
