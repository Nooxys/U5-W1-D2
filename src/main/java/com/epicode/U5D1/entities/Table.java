package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Table {
    private int numberOfTable;
    private int numberOfPeople;
    private TableStatus status;
}
