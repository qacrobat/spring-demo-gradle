package de.qacrobat.springdemogradle.player.adapter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ApiModel("Player to create")
public class PlayerTo {

    @NotBlank
    @ApiModelProperty(required = true, example = "Frank")
    private String name;

    @NotBlank
    @ApiModelProperty(required = true, example = "Mustermann")
    private String lastname;

    @ApiModelProperty(example = "false")
    private boolean vip;

}
