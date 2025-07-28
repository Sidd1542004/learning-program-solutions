import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    {
      cohortCode: "INTADMDF10",
      technology: ".NET FSD",
      startDate: "22-Feb-2022",
      currentStatus: "Scheduled",
      coachName: "Aathma",
      trainerName: "Jojo Jose"
    },
    {
      cohortCode: "ADM21JF014",
      technology: "Java FSD",
      startDate: "10-Sep-2021",
      currentStatus: "Ongoing",
      coachName: "Apoorv",
      trainerName: "Elisa Smith"
    },
    {
      cohortCode: "CDBJF21025",
      technology: "Java FSD",
      startDate: "24-Dec-2021",
      currentStatus: "Ongoing",
      coachName: "Aathma",
      trainerName: "John Doe"
    }
  ];

  return (
    <div>
      <center>
      <h2>Cohorts Details</h2>
      {cohorts.map((c) => (
        <CohortDetails key={c.cohortCode} cohort={c} />
      ))}
      </center>
    </div>
  );
}
export default App;
