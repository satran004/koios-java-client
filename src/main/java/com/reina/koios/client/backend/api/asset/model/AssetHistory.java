package com.reina.koios.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetHistory {

    /**
     * Asset Policy ID (hex)
     */
    private String policyId = null;

    /**
     * Asset Name (hex)
     */
    private String assetName = null;

    /**
     * List of all mint/burn transactions for an asset
     */
    private List<MintingTx> mintingTxs = null;
}
