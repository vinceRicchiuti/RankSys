/* 
 * Copyright (C) 2015 Information Retrieval Group at Universidad Autónoma
 * de Madrid, http://ir.ii.uam.es
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package es.uam.eps.ir.ranksys.nn.user.sim;

import es.uam.eps.ir.ranksys.fast.preference.FastPreferenceData;
import es.uam.eps.ir.ranksys.nn.sim.SetCosineSimilarity;

/**
 * Set cosine user similarity. See {@link SetCosineSimilarity}.
 *
 * @author Saúl Vargas (saul.vargas@uam.es)
 * 
 * @param <U> type of the users
 */
public class SetCosineUserSimilarity<U> extends UserSimilarity<U> {

    /**
     * Constructor.
     *
     * @param recommenderData preference data
     * @param alpha asymmetry of the similarity, set to 0.5 for standard cosine
     * @param dense true for array-based calculations, false to map-based
     */
    public SetCosineUserSimilarity(FastPreferenceData<U, ?> recommenderData, double alpha, boolean dense) {
        super(recommenderData, new SetCosineSimilarity(recommenderData, alpha, dense));
    }

}
