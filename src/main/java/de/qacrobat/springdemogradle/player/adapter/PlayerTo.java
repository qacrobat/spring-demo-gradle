package de.qacrobat.springdemogradle.player.adapter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Setter
@Getter
public class PlayerDTO {
    @ApiParam(required = true, value = "Frank")
    private String name;
    @ApiParam(required = true, value = "Mustermann")
    private String lastname;
    @ApiParam(required = false, value = "false")
    private boolean vip;

}
