/*
    CanZE
    Take a closer look at your ZE car

    Copyright (C) 2015 - The CanZE Team
    http://canze.fisch.lu

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or any
    later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package lu.fisch.canze.actors;

/**
 * Created by jeroen on 4-12-16.
 */

public class EcuDiagUBP {

    // static final public String fieldsString () {
    void load () {

        String fieldDef = // ID (hex), startBit, endBit, resolution, offset (aplied BEFORE resolution multiplication), decimals, unit, requestID (hex string), responseID (hex string),
                // options (hex, see MainActivity for definitions), optional name, optional list
                ""
                        +"77e,16,23,1,0,0,,2184,6184,ff,ECU traceability.calendarweek\n" //
                        +"77e,24,31,1,0,0,,2184,6184,ff,ECU traceability.year\n" //
                        +"77e,32,34,1,0,0,,2184,6184,ff,ECU traceability.plant,0:Blaichach;3:Moulins\n" //
                        +"77e,35,37,1,0,0,,2184,6184,ff,ECU traceability.line,0:Line n°1;1:Line n°2;2:Line n°3;3:Line n°4;4:Line n°5;5:Line n°6;6:Line n°7;7:Line n°8\n" //
                        +"77e,38,39,1,0,0,,2184,6184,ff,ECU traceability.shift,0:Shift n°1;1:Shift n°2;2:Shift n°3;3:Shift n°4\n" //
                        +"77e,40,42,1,0,0,,2184,6184,ff,ECU traceability.day,0:forbidden - interdit;1:monday - lundi;2:tuesday - mardi;3:wednesday - mercredi;4:thursday - jeudi;5:friday - vendredi;6:saturday - samedi;7:sunday - dimanche\n" //
                        +"77e,43,55,1,0,0,,2184,6184,ff,ECU traceability.counter\n" //
                        +"77e,16,23,1,0,0,,21F0,61F0,ff,PartNumber.LowerPart\n" //
                        +"77e,56,63,1,0,0,,21F0,61F0,ff,DiagnosticIdentificationCode\n" //
                        +"77e,64,71,1,0,0,,21F0,61F0,ff,SupplierNumber.ITG\n" //
                        +"77e,88,95,1,0,0,,21F0,61F0,ff,HardwareNumber.LowerPart\n" //
                        +"77e,128,135,1,0,0,,21F0,61F0,ff,SoftwareNumber\n" //
                        +"77e,144,151,1,0,0,,21F0,61F0,ff,EditionNumber\n" //
                        +"77e,160,167,1,0,0,,21F0,61F0,ff,CalibrationNumber\n" //
                        +"77e,176,183,1,0,0,,21F0,61F0,ff,PartNumber.BasicPartList,0:N/A;1:47210;2:47208\n" //
                        +"77e,184,191,1,0,0,,21F0,61F0,ff,HardwareNumber.BasicPartList,0:HARDW;1:47213\n" //
                        +"77e,192,199,1,0,0,,21F0,61F0,ff,ApprovalNumber.BasicPartList,0:N/A\n" //
                        +"77e,200,207,1,0,0,,21F0,61F0,ff,ManufacturerIdentificationCode\n" //
                        +"77e,16,23,1,0,0,,21F1,61F1,ff,ApprovalNumber.LowerPart\n" //
                        +"77e,56,63,1,0,0,,21F1,61F1,ff,Programming site reference\n" //
                        +"77e,96,103,1,0,0,,21F1,61F1,ff,Programming tool reference\n" //
                        +"77e,136,143,1,0,0,,21F1,61F1,ff,Number of reprogrammings\n" //
                        +"77e,144,151,1,0,0,,21F1,61F1,ff,Date of reprogramming\n" //
                        +"77e,168,175,1,0,0,,21F1,61F1,ff,Time of reprogramming\n" //
                        +"77e,184,191,1,0,0,,21F1,61F1,ff,Record marking\n" //
                        +"77e,192,199,1,0,0,,21F1,61F1,ff,CRC of log record\n" //
                        +"77e,16,23,1,0,0,,21FE,61FE,ff,PartNumber.LowerPart\n" //
                        +"77e,56,63,1,0,0,,21FE,61FE,ff,DiagnosticIdentificationCode\n" //
                        +"77e,64,71,1,0,0,,21FE,61FE,ff,SupplierNumber.ITG\n" //
                        +"77e,88,95,1,0,0,,21FE,61FE,ff,HardwareNumber.LowerPart\n" //
                        +"77e,128,135,1,0,0,,21FE,61FE,ff,SoftwareNumber\n" //
                        +"77e,144,151,1,0,0,,21FE,61FE,ff,EditionNumber\n" //
                        +"77e,160,167,1,0,0,,21FE,61FE,ff,CalibrationNumber\n" //
                        +"77e,176,183,1,0,0,,21FE,61FE,ff,PartNumber.BasicPartList,0:N/A;1:47210;2:47208\n" //
                        +"77e,184,191,1,0,0,,21FE,61FE,ff,HardwareNumber.BasicPartList,0:HARDW;1:47213\n" //
                        +"77e,192,199,1,0,0,,21FE,61FE,ff,ApprovalNumber.BasicPartList,0:N/A\n" //
                        +"77e,200,207,1,0,0,,21FE,61FE,ff,ManufacturerIdentificationCode\n" //
                        +"77e,16,23,1,0,0,,21FF,61FF,ff,ApprovalNumber.LowerPart\n" //
                        +"77e,56,63,1,0,0,,21FF,61FF,ff,Programming site reference\n" //
                        +"77e,96,103,1,0,0,,21FF,61FF,ff,Programming tool reference\n" //
                        +"77e,136,143,1,0,0,,21FF,61FF,ff,Number of reprogrammings\n" //
                        +"77e,144,151,1,0,0,,21FF,61FF,ff,Date of reprogramming\n" //
                        +"77e,168,175,1,0,0,,21FF,61FF,ff,Time of reprogramming\n" //
                        +"77e,184,191,1,0,0,,21FF,61FF,ff,Record marking\n" //
                        +"77e,192,199,1,0,0,,21FF,61FF,ff,CRC of log record\n" //
                        +"77e,24,31,.1,0,0,V,22012F,62012F,ff,Supply voltage\n" //
                        +"77e,24,39,.01,0,0,km/h,224B00,624B00,ff,WheelSpeed FL\n" //
                        +"77e,24,39,.01,0,0,km/h,224B01,624B01,ff,WheelSpeed FR\n" //
                        +"77e,24,39,.01,0,0,km/h,224B02,624B02,ff,WheelSpeed RL\n" //
                        +"77e,24,39,.01,0,0,km/h,224B03,624B03,ff,WheelSpeed RR\n" //
                        +"77e,24,39,.01,0,0,km/h,224B04,624B04,ff,Vehicle speed\n" //
                        +"77e,24,31,1,0,0,,224B70,624B70,ff,Filling status,0:To be Defined\n" //
                        +"77e,24,31,.2,127,0,°,224B36,624B36,ff,Steering wheel angle offset\n" //
                        +"77e,24,31,1,0,0,,224B3D,624B3D,ff,Supplier fault code\n" //
                        +"77e,24,31,1,0,0,bar,224B73,624B73,ff,Master cylinder pressure\n" //
                        +"77e,24,31,1,0,0,,224B18,624B18,ff,After sales date.Day\n" //
                        +"77e,32,39,1,0,0,,224B18,624B18,ff,After sales date.Month\n" //
                        +"77e,40,47,1,0,0,,224B18,624B18,ff,After sales date.Year\n" //
                        +"77e,24,31,1,0,0,,224B1A,624B1A,ff,Vehicle status\n" //
                        +"77e,24,39,1,0,0,mm,224B24,624B24,ff,Tires real circumference\n" //
                        +"77e,24,31,10,-1,0,s,224B25,624B25,ff,Powerlatch duration\n" //
                        +"77e,24,31,.2,127,0,Bar,224B74,624B74,ff,Master cylinder pressure offset\n" //
                        +"77e,24,39,.1,32767,0,°,220100,620100,ff,Steering wheel angle\n" //
                        +"77e,24,39,.1,32767,0,°/s,224B42,624B42,ff,Steering wheel speed\n" //
                        +"77e,24,39,1,0,0,,224B44,624B44,ff,List of supplier internal faults\n" //
                        +"77e,24,31,1,0,0,,22F18E,62F18E,ff,Vehicle manufacturer spare part number\n" //
                        +"77e,16,23,1,0,0,,2181,6181,ff,Vehicle identification number\n" //
                        +"77e,152,159,1,0,0,,2181,6181,ff,Vehicle identification number CRC\n" //
                        +"77e,16,23,1,0,0,,3201,7201,ff,Routine.Output command status,0:Routine ready to start;1:Routine in progress;2:Routine completed and OK or ready to start;3:Routine completed and Not OK;16:Erreur d'écriture;128:Test prêt;132:Choix du roue invalide;144:Routine interrompue par l'outils de diagnostic\n" //
                        +"77e,28,55,10,0,0,m,224B9B,624B9B,ff,Vehicle odometer.Odometer\n" //
                        +"77e,24,27,1,0,0,,224B9B,624B9B,ff,Vehicle odometer.Reserved,0:reserved\n" //
                        +"77e,24,31,10,-1,0,s,224B9A,624B9A,ff,Brake Powerlatch duration\n" //
                        +"77e,24,31,1,0,0,bar,224B75,624B75,ff,Accumulator pressure\n" //
                        +"77e,24,31,1,0,0,bar,224B71,624B71,ff,Sense piston pressure\n" //
                        +"77e,24,31,.2,127,0,bar,224B72,624B72,ff,Sense piston pressure offset\n" //
                        +"77e,24,31,1,0,0,,224B80,624B80,ff,HBB function inhibition state,0:Activated by diag;170:Deactivated by diag;255:Not implemented\n" //
                        +"77e,24,31,1,0,0,,224B81,624B81,ff,EB function inhibition state,0:Activated by diag;170:Deactivated by diag;255:Not implemented\n" //
                        +"77e,24,31,1,0,0,mm,224B77,624B77,ff,Brake pedal position 1\n" //
                        +"77e,24,31,.2,77,0,mm,224B78,624B78,ff,Brake pedal position 1 offset\n" //
                        +"77e,24,31,1,0,0,mm,224B79,624B79,ff,Brake pedal position 2\n" //
                        +"77e,24,31,.2,77,0,mm,224B7A,624B7A,ff,Brake pedal position 2 offset\n" //
                        +"77e,29,29,1,0,0,,224B90,624B90,ff,UBP Function status.PUMP function.activation status,0:not active;1:active\n" //
                        +"77e,28,28,1,0,0,,224B90,624B90,ff,UBP Function status.PUMP function.failure status,0:not operational;1:operational\n" //
                        +"77e,27,27,1,0,0,,224B90,624B90,ff,UBP Function status.EB function.activation status,0:not active;1:active\n" //
                        +"77e,26,26,1,0,0,,224B90,624B90,ff,UBP Function status.EB function.failure status,0:not operational;1:operational\n" //
                        +"77e,25,25,1,0,0,,224B90,624B90,ff,UBP Function status.HBB function.activation status,0:not active;1:active\n" //
                        +"77e,24,24,1,0,0,,224B90,624B90,ff,UBP Function status.HBB function.failure status,0:not operational;1:operational\n" //
                        +"77e,30,30,1,0,0,,224B90,624B90,ff,UBP Function status.Mode roller bench function.activation status,0:not active;1:active\n" //
                        +"77e,33,33,1,0,0,,224B90,624B90,ff,UBP Function status.HBA function.activation status,0:not active;1:active\n" //
                        +"77e,31,31,1,0,0,,224B90,624B90,ff,UBP Function status.Advanced diagnosis function.activation status,0:not active;1:active\n" //
                        +"77e,32,32,1,0,0,,224B90,624B90,ff,UBP Function status.HBA function.failure status,0:not operational;1:operational\n" //
                        +"77e,34,39,1,0,0,,224B90,624B90,ff,UBP Function status.reserved,0:reserved\n" //
                        +"77e,28,39,1,4094,0,N·m,224B7B,624B7B,ff,Electric brake wheels torque applied\n" //
                        +"77e,24,31,1,0,0,,224B84,624B84,ff,PUMP function inhibition state,0:Activated by diag;170:Deactivated by diag;255:Not implemented\n" //
                        +"77e,24,39,.01,0,0,km/h,224B8A,624B8A,ff,Vehicle speed Delayed\n" //
                        +"77e,24,31,1,0,0,bar,224B95,624B95,ff,Sense piston pressure Delayed\n" //
                        +"77e,24,31,128,0,0,bar,224B96,624B96,ff,Master cylinder pressure Delayed\n" //
                        +"77e,24,31,1,0,0,bar,224B97,624B97,ff,Accumulator pressure Delayed\n" //
                        +"77e,24,31,1,0,0,mm,224B98,624B98,ff,Brake pedal position 1 Delayed\n" //
                        +"77e,24,31,1,0,0,mm,224B99,624B99,ff,Brake pedal position 2 Delayed\n" //
                        +"77e,28,39,1,4094,0,N·m,224B7C,624B7C,ff,Electric brake wheels torque request\n" //
                        +"77e,28,39,1,4094,0,N·m,224B9D,624B9D,ff,Electric brake wheels torque request Delayed\n" //
                        +"77e,28,39,1,4094,0,N·m,224B7D,624B7D,ff,Total Hydraulic brake wheels torque request\n" //
                        +"77e,28,39,1,4094,0,N·m,224B9E,624B9E,ff,Total Hydraulic brake wheels torque request Delayed\n" //
                        +"77e,28,39,1,4094,0,N·m,224B7E,624B7E,ff,Driver brake wheels torque request\n" //
                        +"77e,28,39,1,4094,0,N·m,224B9C,624B9C,ff,Electric brake wheels torque applied Delayed\n" //
                        +"77e,28,39,1,4094,0,N·m,224B9F,624B9F,ff,Driver brake wheels torque request Delayed\n" //
                        +"77e,24,47,1,0,0,W/h,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.ElecCurrent\n" //
                        +"77e,48,63,1,0,0,km,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.OdometerCounter\n" //
                        +"77e,64,87,1,0,0,W/h,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.ElecN\n" //
                        +"77e,88,111,1,0,0,km,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.OdometerN\n" //
                        +"77e,112,135,1,0,0,W/h,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.ElecN1\n" //
                        +"77e,136,159,1,0,0,km,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.OdometerN1\n" //
                        +"77e,160,183,1,0,0,W/h,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.ElecN2\n" //
                        +"77e,184,207,1,0,0,km,224B92,624B92,ff,Gain Elec kWh per km on gaz pedal released.OdometerN2\n" //
                        +"77e,24,47,1,0,0,W/h,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.ElecCurrent\n" //
                        +"77e,48,63,1,0,0,km,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.OdometerCounter\n" //
                        +"77e,64,87,1,0,0,W/h,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.ElecN\n" //
                        +"77e,88,111,1,0,0,km,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.OdometerN\n" //
                        +"77e,112,135,1,0,0,W/h,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.ElecN1\n" //
                        +"77e,136,159,1,0,0,km,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.OdometerN1\n" //
                        +"77e,160,183,1,0,0,W/h,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.ElecN2\n" //
                        +"77e,184,207,1,0,0,km,224B91,624B91,ff,Gain Elec kWh per km on brake pedal pressed.OdometerN2\n" //
                        +"77e,24,31,1,0,0,,224B85,624B85,ff,Mode roller bench function activation state,0:Deactivated by diag;170:Activated by diag\n" //
                        +"77e,28,55,10,0,0,m,224B09,624B09,ff,Odometer of the first occurence.Odometer\n" //
                        +"77e,24,27,1,0,0,,224B09,624B09,ff,Odometer of the first occurence.Reserved,0:reserved\n" //
                        +"77e,24,31,.2,127,0,bar,224B76,624B76,ff,Accumulator pressure offset\n" //
                        +"77e,24,31,1,0,0,,224B7F,624B7F,ff,HBA function inhibition state,0:Activated by diag;170:Deactivated by diag;255:Not implemented\n" //
                        +"77e,24,31,1,0,0,,224B86,624B86,ff,Advanced diagnosis function activation state,0:Deactivated by diag;170:Activated by diag\n" //
                        +"77e,24,31,1,0,0,,224B82,624B82,ff,Advanced diagnostic datas memorized buffer1\n" //
                        +"77e,24,31,1,0,0,,224B8F,624B8F,ff,Advanced diagnostic datas memorized buffer10\n" //
                        +"77e,24,31,1,0,0,,224B83,624B83,ff,Advanced diagnostic datas memorized buffer2\n" //
                        +"77e,24,31,1,0,0,,224B87,624B87,ff,Advanced diagnostic datas memorized buffer3\n" //
                        +"77e,24,31,1,0,0,,224B88,624B88,ff,Advanced diagnostic datas memorized buffer4\n" //
                        +"77e,24,31,1,0,0,,224B89,624B89,ff,Advanced diagnostic datas memorized buffer5\n" //
                        +"77e,24,31,1,0,0,,224B8B,624B8B,ff,Advanced diagnostic datas memorized buffer6\n" //
                        +"77e,24,31,1,0,0,,224B8C,624B8C,ff,Advanced diagnostic datas memorized buffer7\n" //
                        +"77e,24,31,1,0,0,,224B8D,624B8D,ff,Advanced diagnostic datas memorized buffer8\n" //
                        +"77e,24,31,1,0,0,,224B8E,624B8E,ff,Advanced diagnostic datas memorized buffer9\n" //
                        +"77e,16,23,1,0,0,,2180,6180,ff,PartNumber.LowerPart\n" //
                        +"77e,56,63,1,0,0,,2180,6180,ff,DiagnosticIdentificationCode\n" //
                        +"77e,64,71,1,0,0,,2180,6180,ff,SupplierNumber.ITG\n" //
                        +"77e,88,95,1,0,0,,2180,6180,ff,HardwareNumber.LowerPart\n" //
                        +"77e,128,135,1,0,0,,2180,6180,ff,SoftwareNumber\n" //
                        +"77e,144,151,1,0,0,,2180,6180,ff,EditionNumber\n" //
                        +"77e,160,167,1,0,0,,2180,6180,ff,CalibrationNumber\n" //
                        +"77e,176,183,1,0,0,,2180,6180,ff,PartNumber.BasicPartList,0:N/A;1:47210;2:47208\n" //
                        +"77e,184,191,1,0,0,,2180,6180,ff,HardwareNumber.BasicPartList,0:HARDW;1:47213\n" //
                        +"77e,192,199,1,0,0,,2180,6180,ff,ApprovalNumber.BasicPartList,0:N/A\n" //
                        +"77e,200,207,1,0,0,,2180,6180,ff,ManufacturerIdentificationCode\n" //
                        +"77e,24,39,1,0,0,min,224B93,624B93,ff,Running Pump Cumulated\n" //

                ;

        Frames.getInstance().load ("7BC,0,0,UBP\n");
        Fields.getInstance().load (fieldDef);
    }
}
