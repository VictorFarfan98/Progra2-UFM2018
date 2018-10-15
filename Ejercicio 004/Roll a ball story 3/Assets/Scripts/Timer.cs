using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;


public class Timer : MonoBehaviour {

	public Text timerText;
	private float timeleft = 30.0f;
	public Text winText;

	// Use this for initialization
	void Start () {
		timerText.text = timeleft.ToString();
	}
	
	// Update is called once per frame
	void Update () {
		
		timeleft -= Time.deltaTime;
		timerText.text = timeleft.ToString();
		if (timeleft < 0)
		{
			GameOver();
		}
		
		
	}

	private void GameOver()
	{
		//Destroy(timerText.gameObject);
		//Destroy(pc.ColorText.gameObject);
		timerText.text = "Times Up!";
		GetComponent<PlayerController>().enabled = false;
		if(GetComponent<PlayerController>().count > 20)
		{
			winText.text = "Winner!!";
		}
		else
		{
			winText.text = "Loser!!";
		}
	}
}
