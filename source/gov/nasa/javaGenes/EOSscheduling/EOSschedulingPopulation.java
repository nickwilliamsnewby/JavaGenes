//
// Copyright (C) 2005 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA.txt at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
//  Created by Al Globus on Wed Jul 03 2002.
package gov.nasa.javaGenes.EOSscheduling;

import gov.nasa.javaGenes.core.Population;
import gov.nasa.javaGenes.core.Individual;
import gov.nasa.javaGenes.core.FitnessFunction;
import gov.nasa.javaGenes.core.Evolvable;

public class EOSschedulingPopulation extends Population {

public EOSschedulingPopulation (EOSschedulingParameters parameters) {
    this(parameters.permutationLength, parameters.populationSize, parameters.fitnessFunction);
}
public EOSschedulingPopulation (int permutationLength, int populationSize, FitnessFunction fitness) {
    super(populationSize);
    for (int i = 0; i < population.length; i++)
        population[i] = new EOSschedulingIndividual(new EOSschedulingEvolvable(permutationLength),fitness);
}

/**
create an empty population with int size members
*/
protected EOSschedulingPopulation(int size) {super(size);}
/**
@return a new empty population with int size members
*/
public Population makePopulation(int size) {
    return new EOSschedulingPopulation(size);
}

public Individual makeIndividual(Evolvable e, FitnessFunction f) {
  return new EOSschedulingIndividual((EOSschedulingEvolvable)e,f);
}
}
