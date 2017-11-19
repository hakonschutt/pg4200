package org.pg4200.optimization.knapsack;

import java.util.Objects;

/**
 * Instances taken from:
 *
 * https://people.sc.fsu.edu/~jburkardt/datasets/knapsack_01/knapsack_01.html
 * http://www.diku.dk/~pisinger/codes.html
 *
 * Created by arcuri82 on 09-Oct-17.
 */
public class KnapsackInstanceWithSolution {

    private final KnapsackProblem problem;

    private final boolean[] best;

    private KnapsackInstanceWithSolution(KnapsackProblem problem, boolean[] best) {
        this.problem = Objects.requireNonNull(problem);
        this.best = Objects.requireNonNull(best);

        if(best.length != problem.getSize()){
            throw new IllegalArgumentException("Size mismatch");
        }
    }

    public KnapsackProblem getProblem() {
        return problem;
    }

    public boolean[] getBest() {
        return best.clone();
    }

    public double getBestFitness(){
        return problem.evaluate(best);
    }

    public static KnapsackInstanceWithSolution problemP05(){

        return new KnapsackInstanceWithSolution(
                new KnapsackProblem(
                        26,
                        new double[]{12, 7, 11, 8, 9},
                        new double[]{24, 13, 23, 15, 16}
                ),
                new boolean[]{false, true, true, true, false}
        );
    }

    public static KnapsackInstanceWithSolution problemP15(){

        return new KnapsackInstanceWithSolution(
                new KnapsackProblem(
                        750,
                        new double[]{70, 73 , 77, 80, 82, 87, 90, 94, 98, 106, 110, 113, 115, 118, 120},
                        new double[]{135, 139, 149, 150, 156, 163, 173, 184, 192, 201, 210, 214, 221, 229, 240}
                ),
                new boolean[]{true, false, true, false, true, false,true,true,true,false,false,false,false,true,true}
        );
    }


    public static KnapsackInstanceWithSolution problemP24(){

        return new KnapsackInstanceWithSolution(
                new KnapsackProblem(
                        6404180,
                        new double[]{
                                382745,
                                799601,
                                909247,
                                729069,
                                467902,
                                44328,
                                34610,
                                698150,
                                823460,
                                903959,
                                853665,
                                551830,
                                610856,
                                670702,
                                488960,
                                951111,
                                323046,
                                446298,
                                931161,
                                31385,
                                496951,
                                264724,
                                224916,
                                169684},
                        new double[]{
                                825594,
                                1677009,
                                1676628,
                                1523970,
                                943972,
                                97426,
                                69666,
                                1296457,
                                1679693,
                                1902996,
                                1844992,
                                1049289,
                                1252836,
                                1319836,
                                953277,
                                2067538,
                                675367,
                                853655,
                                1826027,
                                65731,
                                901489,
                                577243,
                                466257,
                                369261}
                ),
                new boolean[]{
                        true,
                        true,
                        false,
                        true,
                        true,
                        true,
                        false,
                        false,
                        false,
                        true,
                        true,
                        false,
                        true,
                        false,
                        false,
                        true,
                        false,
                        false,
                        false,
                        false,
                        false,
                        true,
                        true,
                        true}
        );
    }


    public static KnapsackInstanceWithSolution problemP100() {

        return new KnapsackInstanceWithSolution(
                new KnapsackProblem(
                        17689,
                        new double[]{
                                576,
                                168,
                                864,
                                126,
                                105,
                                192,
                                105,
                                210,
                                288,
                                63,
                                960,
                                126,
                                126,
                                168,
                                384,
                                960,
                                84,
                                210,
                                147,
                                84,
                                960,
                                126,
                                147,
                                288,
                                288,
                                63,
                                126,
                                960,
                                288,
                                384,
                                288,
                                168,
                                189,
                                672,
                                864,
                                168,
                                288,
                                126,
                                864,
                                21,
                                768,
                                960,
                                864,
                                63,
                                105,
                                576,
                                147,
                                147,
                                96,
                                189,
                                864,
                                147,
                                21,
                                189,
                                42,
                                192,
                                126,
                                42,
                                864,
                                189,
                                210,
                                126,
                                672,
                                21,
                                105,
                                96,
                                126,
                                210,
                                189,
                                21,
                                288,
                                672,
                                768,
                                63,
                                960,
                                864,
                                96,
                                147,
                                21,
                                672,
                                960,
                                63,
                                21,
                                168,
                                576,
                                576,
                                672,
                                960,
                                210,
                                480,
                                42,
                                42,
                                960,
                                21,
                                576,
                                768,
                                288,
                                480,
                                864,
                                864
                        },
                        new double[]{
                                708,
                                1464,
                                1062,
                                1098,
                                915,
                                236,
                                915,
                                1830,
                                354,
                                549,
                                1180,
                                1098,
                                1098,
                                1464,
                                472,
                                1180,
                                732,
                                1830,
                                1281,
                                732,
                                1180,
                                1098,
                                1281,
                                354,
                                354,
                                549,
                                1098,
                                1180,
                                354,
                                472,
                                354,
                                1464,
                                1647,
                                826,
                                1062,
                                1464,
                                354,
                                1098,
                                1062,
                                183,
                                944,
                                1180,
                                1062,
                                549,
                                915,
                                708,
                                1281,
                                1281,
                                118,
                                1647,
                                1062,
                                1281,
                                183,
                                1647,
                                366,
                                236,
                                1098,
                                366,
                                1062,
                                1647,
                                1830,
                                1098,
                                826,
                                183,
                                915,
                                118,
                                1098,
                                1830,
                                1647,
                                183,
                                354,
                                826,
                                944,
                                549,
                                1180,
                                1062,
                                118,
                                1281,
                                183,
                                826,
                                1180,
                                549,
                                183,
                                1464,
                                708,
                                708,
                                826,
                                1180,
                                1830,
                                590,
                                366,
                                366,
                                1180,
                                183,
                                708,
                                944,
                                354,
                                590,
                                1062,
                                1062
                        }
                ),
                new boolean[]{
                        true,
                        true,
                        false,
                        true,
                        true,
                        false,
                        true,
                        true,
                        false,
                        true,
                        false,
                        true,
                        true,
                        true,
                        false,
                        false,
                        true,
                        true,
                        true,
                        true,
                        false,
                        true,
                        true,
                        false,
                        false,
                        true,
                        true,
                        false,
                        false,
                        false,
                        false,
                        true,
                        true,
                        false,
                        false,
                        true,
                        false,
                        true,
                        false,
                        true,
                        false,
                        false,
                        false,
                        true,
                        true,
                        false,
                        true,
                        true,
                        false,
                        true,
                        false,
                        true,
                        true,
                        true,
                        true,
                        false,
                        true,
                        true,
                        false,
                        true,
                        true,
                        true,
                        false,
                        true,
                        true,
                        false,
                        true,
                        true,
                        true,
                        true,
                        false,
                        false,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        true,
                        false,
                        true,
                        false
                }
        );
    }


}
