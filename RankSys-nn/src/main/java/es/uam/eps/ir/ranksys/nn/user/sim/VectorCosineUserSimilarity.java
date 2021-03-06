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
import es.uam.eps.ir.ranksys.nn.sim.VectorCosineSimilarity;

/**
 * Vector cosine user similarity. See {@link VectorCosineSimilarity}.
 *
 * @author Saúl Vargas (saul.vargas@uam.es)
 * 
 * @param <U> type of the users
 */
public class VectorCosineUserSimilarity<U> extends UserSimilarity<U> {

    /**
     * Constructor.
     *
     * @param data preference data
     * @param alpha asymmetry factor, set to 0.5 to standard cosine.
     * @param dense true for array-based calculations, false to map-based
     */
    public VectorCosineUserSimilarity(FastPreferenceData<U, ?> data, double alpha, boolean dense) {
        super(data, new VectorCosineSimilarity(data, alpha, dense));
    }
    
}
