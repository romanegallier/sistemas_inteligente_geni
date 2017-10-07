package animauxPlante;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Lion <br>
 * @version generated on Sat Sep 30 17:35:42 BRT 2017 by romane
 */

public interface Lion extends Carnivore {

    /* ***************************************************
     * Property http://www.semanticweb.org/romane/ontologies/2017/8/AnimauxPlantes.owl#mange
     */
     
    /**
     * Gets all property values for the mange property.<p>
     * 
     * @returns a collection of values for the mange property.
     */
    Collection<? extends WrappedIndividual> getMange();

    /**
     * Checks if the class has a mange property value.<p>
     * 
     * @return true if there is a mange property value.
     */
    boolean hasMange();

    /**
     * Adds a mange property value.<p>
     * 
     * @param newMange the mange property value to be added
     */
    void addMange(WrappedIndividual newMange);

    /**
     * Removes a mange property value.<p>
     * 
     * @param oldMange the mange property value to be removed.
     */
    void removeMange(WrappedIndividual oldMange);


    /* ***************************************************
     * Property http://www.semanticweb.org/romane/ontologies/2017/8/AnimauxPlantes.owl#mangePar
     */
     
    /**
     * Gets all property values for the mangePar property.<p>
     * 
     * @returns a collection of values for the mangePar property.
     */
    Collection<? extends WrappedIndividual> getMangePar();

    /**
     * Checks if the class has a mangePar property value.<p>
     * 
     * @return true if there is a mangePar property value.
     */
    boolean hasMangePar();

    /**
     * Adds a mangePar property value.<p>
     * 
     * @param newMangePar the mangePar property value to be added
     */
    void addMangePar(WrappedIndividual newMangePar);

    /**
     * Removes a mangePar property value.<p>
     * 
     * @param oldMangePar the mangePar property value to be removed.
     */
    void removeMangePar(WrappedIndividual oldMangePar);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
