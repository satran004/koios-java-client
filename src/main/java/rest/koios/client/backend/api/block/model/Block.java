package rest.koios.client.backend.api.block.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Block
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

    /**
     * Hash of the block
     */
    private String hash = null;

    /**
     * Epoch number of the block
     */
    private Integer epoch = null;

    /**
     * Absolute slot number of the block
     */
    private Integer absSlot = null;

    /**
     * Slot number of the block in epoch
     */
    private Integer epochSlot = null;

    /**
     * Block Height
     */
    private Integer blockHeight = null;

    /**
     * Block size in bytes
     */
    private Long blockSize = null;

    /**
     * Timestamp of the block
     */
    private String blockTime = null;

    /**
     * Number of transactions in the block
     */
    private Integer txCount = null;

    /**
     * VRF key of the block producer
     */
    private String vrfKey = null;

    /**
     * Counter value of the operational certificate used to create this block
     */
    private Integer opCertCounter = null;

    /**
     * Pool ID in bech32 format
     */
    private String pool = null;


}
