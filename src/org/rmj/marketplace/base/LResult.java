/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rmj.marketplace.base;

/**
 *
 * @author User
 */
public interface LResult {
    void MasterRetreive(int fnIndex, Object foValue);
    void OnSave(String message);
    void OnCancel(String message);
}
