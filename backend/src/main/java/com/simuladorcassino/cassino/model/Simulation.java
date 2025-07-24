package com.simuladorcassino.cassino.model;

public class Simulation {
    private int numberOfPlayers;
    private double initialBalance;
    private double betAmount;
    private double machineWinPercentage;
    private int numberOfRounds;
    private double[] finalBalances;

    public Simulation() {}

    public Simulation(int numberOfPlayers, double initialBalance, double betAmount,
                      double machineWinPercentage, int numberOfRounds) {
        this.numberOfPlayers = numberOfPlayers;
        this.initialBalance = initialBalance;
        this.betAmount = betAmount;
        this.machineWinPercentage = machineWinPercentage;
        this.numberOfRounds = numberOfRounds;
        this.finalBalances = new double[numberOfPlayers];
    }

    // Getters e Setters
    public int getNumberOfPlayers() { return numberOfPlayers; }
    public void setNumberOfPlayers(int numberOfPlayers) { this.numberOfPlayers = numberOfPlayers; }
    public double getInitialBalance() { return initialBalance; }
    public void setInitialBalance(double initialBalance) { this.initialBalance = initialBalance; }
    public double getBetAmount() { return betAmount; }
    public void setBetAmount(double betAmount) { this.betAmount = betAmount; }
    public double getMachineWinPercentage() { return machineWinPercentage; }
    public void setMachineWinPercentage(double machineWinPercentage) { this.machineWinPercentage = machineWinPercentage; }
    public int getNumberOfRounds() { return numberOfRounds; }
    public void setNumberOfRounds(int numberOfRounds) { this.numberOfRounds = numberOfRounds; }
    public double[] getFinalBalances() { return finalBalances; }
    public void setFinalBalances(double[] finalBalances) { this.finalBalances = finalBalances; }
}