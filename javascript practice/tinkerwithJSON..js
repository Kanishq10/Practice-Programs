let fs=require('fs');
let xlsx=require('xlsx');
let buffer=fs.readFileSync('./example.json');
console.log(buffer);
let datarr=JSON.parse(buffer);
// console.log(datarr);
datarr.push(
    {
        "name":"Astham",
        "last name":"Kumar",
        "iscoder":"true",
        "friends":"No one",
        "place":{
            "Delhi":"Delhi 6",
            "Noida":"it park",
            "New Jersey":"help I am suffocating"
        }
    }

);

// console.log(datarr);
function excelWriter(datarr,filename) {
  // excel ,npm has libraries
  // create new workbook
  let newwb = xlsx.utils.book_new();
  //convert json data to excel
  let newws = xlsx.utils.json_to_sheet(datarr);
  //adding new sheet
  xlsx.utils.book_append_sheet(newwb, newws, "sheet_1");
  //write
  xlsx.writeFile(newwb, "abc.xlsx");
}

function excelReader(filename,sheetname) {
  let wb = xlsx.readFile("abc.xlsx");
  let excelData = wb.Sheets["sheet_1"];
  let ans = xlsx.utils.sheet_to_json(excelData);
  console.log(ans);
}


