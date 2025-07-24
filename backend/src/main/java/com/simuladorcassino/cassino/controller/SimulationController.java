package com.simuladorcassino.cassino.controller;
import com.simuladorcassino.cassino.model.Simulation;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/simulation")
@CrossOrigin(origins = "http://localhost:3000")
public class SimulationController {

    @PostMapping("/run")
    public Simulation runSimulation(@RequestBody Simulation simulation) {
        Random random = new Random();
        double[] finalBalances = new double[simulation.getNumberOfPlayers()];

        for (int i = 0; i < simulation.getNumberOfPlayers(); i++) {
            finalBalances[i] = simulation.getInitialBalance();
        }

        for (int round = 0; round < simulation.getNumberOfRounds(); round++) {
            for (int player = 0; player < simulation.getNumberOfPlayers(); player++) {
                if (finalBalances[player] >= simulation.getBetAmount()) {
                    double chance = random.nextDouble() * 100;
                    if (chance >= simulation.getMachineWinPercentage()) {
                        finalBalances[player] += simulation.getBetAmount();
                    } else {
                        finalBalances[player] -= simulation.getBetAmount();
                    }
                }
            }
        }

        simulation.setFinalBalances(finalBalances);
        return simulation;
    }
}