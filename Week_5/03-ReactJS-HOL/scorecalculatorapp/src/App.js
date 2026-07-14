import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Shahistha"
        School="Sk High School"
        Total={450}
        goal={5}
      />
    </div>
  );
}

export default App;