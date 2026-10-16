package com.example.campus_guide_app;

import java.util.ArrayList;

public class RoomData {
    public static final float STAIR_X = 2200;
    public static final float STAIR_Y = 1800;
    public static ArrayList<Room> getRoomsForFloor(int floor) {

        ArrayList<Room> rooms = new ArrayList<>();

        switch (floor) {

            case 0:

                rooms.add(new Room("001", "Admission", 0,2637,3423));
                rooms.add(new Room("002", "Placement", 0,2644,3799));
                rooms.add(new Room("003", "CUB", 0,2577,4146));
                rooms.add(new Room("004", "Girls Visitor Washroom", 0,2549,4258));
                rooms.add(new Room("005", "Mens Visitor Washroom", 0,2566,4308));
                rooms.add(new Room("006", "Service Room", 0,2580,4418));
                rooms.add(new Room("007", "Store", 0,2518,4559));
                rooms.add(new Room("008", "Project Manager", 0,2214,4537));
                rooms.add(new Room("009", "Visitors Lounge", 0,1720,4579));
                rooms.add(new Room("010", "Pantry", 0,1555,4500));
                rooms.add(new Room("011", "PRO & Student Welfare Office", 0,1543,4402));
                rooms.add(new Room("012", "HR Office", 0,1433,4558));
                rooms.add(new Room("013", "Advisor Office", 0,1337,4574));
                rooms.add(new Room("014", "Board Room", 0,1193,4565));
                rooms.add(new Room("015", "Chairman Office", 0,978,4534));

                rooms.add(new Room("017", "Principal Office", 0,1079,4204));
                rooms.add(new Room("018", "Records Room", 0,1086,3951));
                rooms.add(new Room("019", "Administration Office", 0,1061,3779));
                rooms.add(new Room("020", "Dean Affiliation & Accreditation", 0,1600,3692));
                rooms.add(new Room("021", "Dean Academics", 0,1615,3826));
                rooms.add(new Room("022", "Tinkering Lab", 0,1309,3433));
                rooms.add(new Room("023", "Under Construction Lab", 0,1024,3404));
                rooms.add(new Room("024", "CAED Lab", 0,965,3086));
                rooms.add(new Room("025", "Seminar Hall 1", 0,1669,3209));
                rooms.add(new Room("026", "Electrical Room", 0,1422,2719));
                rooms.add(new Room("027", "Service Room", 0,1439,2576));
                rooms.add(new Room("028", "Material Testing Lab & R&D Lab", 0,1240,2665));
                rooms.add(new Room("029", "CIM & Automation Lab", 0,964,2654));
                rooms.add(new Room("030", "Mens Washroom Lab", 0,931,2419));
                rooms.add(new Room("031", "Mens Washroom", 0,921,2283));
                rooms.add(new Room("032", "Metrology & Measurements Lab", 0,953,2122));
                rooms.add(new Room("033", "Seminar Hall 2", 0,1654,2463));
                rooms.add(new Room("034", "Seminar Hall 3", 0,1641,1678));
                rooms.add(new Room("035", "Structure Lab", 0,1018,1967));
                rooms.add(new Room("036", "Staff Women's Washroom", 0,926,1673));
                rooms.add(new Room("037", "Women's Washroom", 0,908,1564));
                rooms.add(new Room("038", "Design Lab", 0,940,1391));
                rooms.add(new Room("039", "Service Electrical Room", 0,0,0));
                rooms.add(new Room("040", "Classroom 040", 0,1372,1173));
                rooms.add(new Room("041", "Classroom 041", 0,1169,1163));
                rooms.add(new Room("042", "Classroom 042", 0,967,1158));
                rooms.add(new Room("043", "Computer Aided Modelling & Analysis Lab", 0,990,894));
                rooms.add(new Room("044", "CAED Machine Lab", 0,1373,859));
                rooms.add(new Room("045", "Paraplegic Washroom", 0,1693,968));
                rooms.add(new Room("046", "Mens Washroom Staff", 0,1695,845));
                rooms.add(new Room("047", "Classroom 047", 0,1849,881));
                rooms.add(new Room("048", "Classroom 048", 0,2067,894));
                rooms.add(new Room("049", "Classroom 049", 0,2107,1175));
                rooms.add(new Room("050", "Project Lab", 0,1840,1102));
                rooms.add(new Room("051", "Staff Room ISE", 0,1722,1142));
                rooms.add(new Room("052", "Meeting Room", 0,1615,1102));
                rooms.add(new Room("053", "Survey Store", 0,0,0));
                rooms.add(new Room("054", "Restricted Area Service", 0,0,0));
                break;

            case 1:

                rooms.add(new Room("101", "Computer Centre", 1, 2344, 3372));
                rooms.add(new Room("102", "Data Centre", 1, 2382, 3576));
                rooms.add(new Room("103", "Language Lab", 1, 2397, 3733));
                rooms.add(new Room("104", "IT Help Desk", 1, 2159, 3580));
                rooms.add(new Room("105", "EC & VLSI Staff Room", 1, 2147, 3700));
                rooms.add(new Room("106", "Staff Room", 1, 2149, 3816));
                rooms.add(new Room("107", "Women's Washroom Students", 1, 2383, 4072));
                rooms.add(new Room("108", "Mens Washroom Students", 1, 2411, 4166));
                rooms.add(new Room("109", "Women's Washroom Staff", 1, 2417, 4265));
                rooms.add(new Room("110", "Mens Washroom Staff", 1, 2396, 4318));
                rooms.add(new Room("111", "Classroom 111", 1, 2379, 4476));
                //rooms.add(new Room("112", "Classroom 112", 1, 0, 0));
                //rooms.add(new Room("113", "Classroom 113", 1, 0, 0));
                rooms.add(new Room("114", "Staff Room", 1, 1315, 4516));
                rooms.add(new Room("115", "Classroom 115", 1, 1145, 4486));
                rooms.add(new Room("116", "Classroom 116", 1, 951, 4498));
                rooms.add(new Room("117", "Classroom 117", 1, 1033, 4153));
                rooms.add(new Room("118", "Classroom 118", 1, 966, 3739));
                rooms.add(new Room("119", "Controller of Examination Office", 1, 1129, 3729));
                rooms.add(new Room("120", "Classroom 120", 1, 1349, 3757));
                rooms.add(new Room("121", "Classroom 121", 1, 1564, 3818));
                rooms.add(new Room("122", "Classroom 122", 1, 1528, 3699));
                rooms.add(new Room("123", "Meeting Room", 1, 1312, 3390));
                rooms.add(new Room("124", "Humanities Department Staff Room", 1, 1145, 3377));
                rooms.add(new Room("125", "Analog & Power Electronics Lab", 1, 946, 3393));
                rooms.add(new Room("126", "Electrical Measurement Lab", 1, 936, 3141));
                rooms.add(new Room("127", "Project Lab", 1, 966, 2935));
                rooms.add(new Room("128", "Meeting Room", 1, 1603, 3216));
                rooms.add(new Room("129", "EEE Staff Room", 1, 1613, 3025));
                rooms.add(new Room("130", "Classroom 130", 1, 1388, 2689));
                rooms.add(new Room("131", "Classroom 131", 1, 1388, 2592));
                rooms.add(new Room("132", "Service Room 132", 1, 1200, 2670));
                rooms.add(new Room("133", "Service Room 133", 1, 971, 2667));
                rooms.add(new Room("134", "Electrical Machines Lab", 1, 937, 2413));
                rooms.add(new Room("135", "Relay & High Voltage Lab", 1, 948, 2300));
                rooms.add(new Room("136", "Mens Washroom Staff", 1, 937, 2182));
                rooms.add(new Room("137", "Mens Washroom Students", 1, 1577, 2473));
                rooms.add(new Room("138", "Computer Lab", 1, 1596, 2296));
                rooms.add(new Room("139", "Classroom 139", 1, 1597, 1724));
                rooms.add(new Room("140", "Classroom 140", 1, 1624, 1543));
                rooms.add(new Room("141", "Woman's Washroom.Staff", 1, 922, 1682));
                rooms.add(new Room("142", "Woman's Washroom.Student", 1, 931, 1539));
                rooms.add(new Room("143", "Geology Lab", 1, 953, 1400));
                //rooms.add(new Room("144", "Service", 1, 1529, 1219));
                //rooms.add(new Room("145", "Seminar hall", 1, 1331, 1179));
                rooms.add(new Room("146", "Laboratory 146", 1, 1141, 1180));
                rooms.add(new Room("147", "Service Room 147", 1, 956, 1188));
                rooms.add(new Room("148", "Classroom 148", 1, 1039, 876));
                rooms.add(new Room("149", "Classroom 149", 1, 1321, 882));
                rooms.add(new Room("150", "Classroom 150", 1, 1605, 950));
                rooms.add(new Room("151", "Staff Room (AS)", 1, 1612, 846));
                rooms.add(new Room("152", "Logic Design Lab", 1, 1731, 896));
                rooms.add(new Room("153", "Environmental Engineering Lab", 1, 1919, 871));
//                rooms.add(new Room("154", "Environmental Engineering Lab", 1, 1919, 871));
//                rooms.add(new Room("155", "Environmental Engineering Lab", 1, 1919, 871));
                rooms.add(new Room("156", "Computer Lab", 1, 1621, 1185));
                rooms.add(new Room("157", "Computer Lab", 1, 1525, 1099));
//                rooms.add(new Room("158", "Computer Lab", 1, 0, 0));
//                rooms.add(new Room("159", "AE Staff Room", 1, 0, 0));
//                rooms.add(new Room("160", "Meeting Room", 1, 0, 0));
//                rooms.add(new Room("161", "Library", 1, 0, 0));
//                rooms.add(new Room("162", "Service Room", 1, 0, 0));
                break;

            case 2:

                rooms.add(new Room("201", "UAV Lab / Astronomy Club", 2, 2339, 3774));
                rooms.add(new Room("202", "Studio", 2, 2318, 3560));
                rooms.add(new Room("203", "NI Lab View", 2, 2547, 2388));
                rooms.add(new Room("204", "NCC", 2, 2540, 3572));
                rooms.add(new Room("205", "Mass Transfer Lab", 2, 2576, 3740));
                rooms.add(new Room("206", "Women's Washroom Students", 2, 2558, 4050));
                rooms.add(new Room("207", "Mens Washroom Students", 2, 2591, 4146));
                rooms.add(new Room("208", "Women's Washroom Staff", 2, 2589, 4249));
                rooms.add(new Room("209", "Mens Washroom Staff", 2, 2616, 4314));
                rooms.add(new Room("210", "Physics Lab", 2, 2523, 4454));
                rooms.add(new Room("211", "Common Room", 2, 2344, 4496));
                rooms.add(new Room("212", "Physics Lab", 2, 2177, 4496));
                rooms.add(new Room("213", "Classroom 213", 2, 1953, 4487));
                rooms.add(new Room("214", "Classroom 214", 2, 1750, 4494));
                rooms.add(new Room("215", "Laboratory 215", 2, 1382, 4504));
                rooms.add(new Room("216", "Classroom 216", 2, 1181, 4461));
                rooms.add(new Room("217", "Classroom 217", 2, 994, 4483));
                rooms.add(new Room("218", "Classroom 218", 2, 1026, 4175));
                rooms.add(new Room("219", "Physics Staff Room", 2, 1074, 4049));
                rooms.add(new Room("220", "Chemistry Staff Room", 2, 1006, 3715));
                rooms.add(new Room("221", "Classroom 221", 2, 1185, 3756));
                rooms.add(new Room("222", "Classroom 222", 2, 1373, 3740));
                rooms.add(new Room("223", "Classroom 223", 2, 1639, 3804));
                rooms.add(new Room("224", "Dean IQAC", 2, 1624,3688 ));
                rooms.add(new Room("225", "Counsellor Cabin", 2, 1396, 3346));
                rooms.add(new Room("226", "Microcontroller & Embedded Systems Lab", 2, 1180, 3331));
                rooms.add(new Room("227", "Computer Network Lab", 2, 980, 3363));
                rooms.add(new Room("228", "Network Lab", 2, 949, 3121));
                rooms.add(new Room("229", "Meeting Room", 2, 962, 2956));
                rooms.add(new Room("230", "Mechanical Staff Room", 2, 1663, 3213));
                rooms.add(new Room("231", "Classroom 231", 2, 1650, 3055));
                rooms.add(new Room("232", "Classroom 232", 2, 1454, 2712));
                rooms.add(new Room("233", "Service Room 233", 2, 1453, 2598));
                rooms.add(new Room("234", "Service Room 234", 2, 1325, 2634));
                rooms.add(new Room("235", "Library", 2, 1076, 2668));
                rooms.add(new Room("236", "Staff Room", 2, 941, 2596));
                rooms.add(new Room("237", "Dean Research", 2, 946, 2424));
                rooms.add(new Room("238", "Mens Washroom Staff", 2, 939, 2285));
                rooms.add(new Room("239", "Mens Washroom Students", 2, 987, 2138));
                rooms.add(new Room("240", "Classroom 240", 2, 1700, 2453));
                rooms.add(new Room("241", "Classroom 241", 2, 1662, 2277));
                rooms.add(new Room("242", "Classroom 242", 2, 1390, 1921));
                rooms.add(new Room("243", "IUCEE / DBMS Lab / DV Lab", 2, 1187, 1906));
                rooms.add(new Room("244", "Microcontroller / IoT Lab", 2, 959, 1880));
                rooms.add(new Room("245", "Flight Simulation Lab", 2, 940, 1663));
                rooms.add(new Room("246", "Women's Washroom Students", 2, 943, 1568));
                rooms.add(new Room("247", "Women's Washroom Staff", 2, 970, 1379));
                rooms.add(new Room("248", "Python Lab / DS Lab", 2, 1668, 1736));
                rooms.add(new Room("249", "Classroom 249", 2, 1706, 1513));
                rooms.add(new Room("250", "Classroom 250", 2, 1625, 1216));
                rooms.add(new Room("251", "Service Room 251", 2, 1391, 1166));
                rooms.add(new Room("252", "Classroom 252", 2, 1170, 1171));
                rooms.add(new Room("253", "Classroom 253", 2, 984, 1155));
                rooms.add(new Room("254", "Classroom 254", 2, 959, 875));
                rooms.add(new Room("255", "Python Lab", 2, 1170, 850));
                rooms.add(new Room("256", "OS Lab / Communication Network Lab", 2, 1373, 853));
                rooms.add(new Room("257", "DS & CNS Lab / ADA Lab", 2, 1527, 853));
                rooms.add(new Room("258", "Laboratory 258", 2, 1709, 959));
                rooms.add(new Room("259", "Mens Washroom Staff", 2, 1729, 813));
                rooms.add(new Room("260", "Paraplegic Washroom", 2, 1871, 872));
                rooms.add(new Room("261", "POP / C++ Cloud Lab", 2, 2043, 859));
                rooms.add(new Room("262", "C Lab / POP Lab", 2, 2115, 1177));
                rooms.add(new Room("263", "CSE Staff Room", 2, 1846, 1103));
                rooms.add(new Room("264", "Meeting Room", 2, 1720, 1152));
                rooms.add(new Room("265", "Library", 2, 1606, 1083));
                //rooms.add(new Room("266", "Service Room", 2, 0, 0));
                break;

            case 3:

                rooms.add(new Room("301", "Classroom 301", 3, 2345, 3747));
                rooms.add(new Room("302", "Chemical Engineering Staff Room", 3, 2321, 3545));
                rooms.add(new Room("303", "MBA Classroom", 3, 2538, 3409));
                rooms.add(new Room("304", "MBA Staff Room", 3, 2543, 3588));
                rooms.add(new Room("305", "Laboratory 305", 3, 2565, 3740));
                rooms.add(new Room("306", "Women's Washroom Students", 3, 2590, 4053));
                rooms.add(new Room("307", "Mens Washroom Students", 3, 2607, 4152));
                rooms.add(new Room("308", "Women's Washroom Staff", 3, 2604, 4251));
                rooms.add(new Room("309", "Mens Washroom Staff", 3, 2586, 4325));
                rooms.add(new Room("310", "Chemistry Lab", 3, 2551, 4507));
                rooms.add(new Room("311", "Chemistry R&D Lab", 3, 2368, 4486));
                rooms.add(new Room("312", "Chemistry Lab", 3, 2173, 4493));
                rooms.add(new Room("314", "Classroom 314", 3, 1759, 4496));
                rooms.add(new Room("315", "Advanced Communication Technology & Signal Processing Lab", 3, 1379, 4479));
                rooms.add(new Room("316", "Classroom 316", 3, 1179, 4493));
                rooms.add(new Room("317", "Classroom 317", 3, 980, 4486));
                rooms.add(new Room("318", "Classroom 318", 3, 1061, 4101));
                rooms.add(new Room("319", "Mathematics Staff Room", 3, 978, 3749));
                rooms.add(new Room("320", "Classroom 320", 3, 1194, 3732));
                rooms.add(new Room("321", "Classroom 321", 3, 1388, 3719));
                rooms.add(new Room("322", "Classroom 322", 3, 1632, 3801));
                rooms.add(new Room("323", "EC-ACT Staff Room", 3, 1641, 3692));
                rooms.add(new Room("324", "EC-ACT Staff Room", 3, 1388, 3387));
                rooms.add(new Room("325", "Classroom 325", 3, 1187, 3343));
                rooms.add(new Room("326", "Classroom 326", 3, 973, 3372));
                rooms.add(new Room("327", "Classroom 327", 3, 948, 3136));
                rooms.add(new Room("328", "Meeting Room", 3, 1000, 2932));
                rooms.add(new Room("329", "Robotics & Automation Lab", 3, 1703, 3200));
                rooms.add(new Room("330", "Classroom 330", 3, 1650, 3019));
                rooms.add(new Room("331", "Classroom 331", 3, 1460, 2677));
                rooms.add(new Room("332", "Service Room 332", 3, 1463, 2582));
                rooms.add(new Room("333", "Service Room 333", 3, 1238, 2629));
                rooms.add(new Room("334", "Computer Lab", 3, 986, 2636));
                rooms.add(new Room("335", "Laboratory 335", 3, 948, 2403));
                rooms.add(new Room("336", "Mens Washroom Staff", 3, 929, 2295));
                rooms.add(new Room("337", "Mens Washroom Students", 3, 1000, 2117));
                rooms.add(new Room("338", "Classroom 338", 3, 1696, 2413));
                rooms.add(new Room("339", "Classroom 339", 3, 1693, 2267));
                rooms.add(new Room("340", "Classroom 340", 3, 1315, 1898));
                rooms.add(new Room("341", "VLSI & Embedded Systems Lab", 3, 1039, 1899));
                rooms.add(new Room("342", "Signal Processing & Python Lab", 3, 944, 1667));
                rooms.add(new Room("343", "Women's Washroom Students", 3, 918, 1573));
                //344
                rooms.add(new Room("345", "IIOT Lab", 3, 1682, 1724));
                rooms.add(new Room("346", "Classroom 346", 3, 1692, 1527));
                rooms.add(new Room("347", "Classroom 347", 3, 1620, 1201));

                break;
        }

        return rooms;
}
    public static Room findRoom(String roomNumber) {

        for (int floor = 0; floor <= 3; floor++) {

            ArrayList<Room> rooms = getRoomsForFloor(floor);

            for (Room room : rooms) {

                if (room.getRoomNumber().equals(roomNumber)) {
                    return room;
                }
            }
        }

        return null;
    }
}

